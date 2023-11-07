LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libtjwt.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "bf1aae8ef40cbaccb2ef30203ec76c73b3e7de1d"

S = "${WORKDIR}/git"

DEPENDS = "libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

