LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libtjwt.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.5+git${SRCPV}"
SRCREV = "e4e6c27fc1ca15ce82ec88fad8e83fcc34098f56"

S = "${WORKDIR}/git"

DEPENDS = "libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

