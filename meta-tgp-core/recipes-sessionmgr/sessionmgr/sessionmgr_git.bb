LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/sessionmgr.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.6+git${SRCPV}"
SRCREV = "64e0292f10eb4f17fad7e1cb69b1b5bcb39b60d7"

S = "${WORKDIR}/git"

DEPENDS = "varserver virtual/crypt libtjwt"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

