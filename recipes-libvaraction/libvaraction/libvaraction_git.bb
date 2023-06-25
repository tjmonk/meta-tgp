# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libvaraction.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "68284eda6817bd51fb6e4ad5226a5eae9ab912d8"

DEPENDS = "varserver"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

