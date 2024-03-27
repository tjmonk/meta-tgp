LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/sessionmgr.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.7+git${SRCPV}"
SRCREV = "0401496898b0092c083155359a8fbdeb9dc81389"

S = "${WORKDIR}/git"

DEPENDS = "varserver virtual/crypt libtjwt"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

