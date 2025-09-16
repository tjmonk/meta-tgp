LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/sessionmgr.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.10+git${SRCPV}"
SRCREV = "3681158f9ed9691cc3e8ffe70b6bd9349c658204"

S = "${WORKDIR}/git"

DEPENDS = "varserver virtual/crypt libtjwt"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

