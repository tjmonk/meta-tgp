# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libtjson.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.6+git${SRCPV}"
SRCREV = "dfacce0b8c1681b7c7db29831398138384f050eb"

S = "${WORKDIR}/git"

DEPENDS = "flex-native bison-native"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

