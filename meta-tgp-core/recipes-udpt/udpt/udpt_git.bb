# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c02c14313846fbed7776c5e0ea3c51c7"

SRC_URI = "git://github.com/tjmonk/udpt.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.3+git${SRCPV}"
# SRCREV = tags/v0.3
SRCREV = "bcf8af9142a60f2123aa7797d0666da654b5b28b"

S = "${WORKDIR}/git"

DEPENDS = "varserver"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
