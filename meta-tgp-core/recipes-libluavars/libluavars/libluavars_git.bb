# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libluavars.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
# SRCREV = tags/v0.1
SRCREV = "62a6dfd334dfcb09a8a2f1af5daa3e979b99de3e"

S = "${WORKDIR}/git"

DEPENDS = "varserver lua"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
