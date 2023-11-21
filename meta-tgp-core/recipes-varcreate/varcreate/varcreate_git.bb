# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varcreate.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.9+git${SRCPV}"
SRCREV = "2a5fe2610ebc8eb35d3f85f29eb44d7330b54f2f"

S = "${WORKDIR}/git"

DEPENDS += "varserver"

# NOTE: the following library dependencies are unknown, ignoring: REQUIRED
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

