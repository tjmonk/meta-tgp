# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/iotexec;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "f24d730ba2e800b4cfeea645ac1eb3e57aee8a5e"

S = "${WORKDIR}/git"

DEPENDS = "libiotclient"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

