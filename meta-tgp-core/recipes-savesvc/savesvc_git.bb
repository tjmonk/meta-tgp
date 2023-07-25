# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/savesvc.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "6f0bca5ce562273e8daf54a4e2b8466f29a163b3"

S = "${WORKDIR}/git"

DEPENDS = "varserver"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

