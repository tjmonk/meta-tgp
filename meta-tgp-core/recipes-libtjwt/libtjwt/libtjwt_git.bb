LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libtjwt.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.3+git${SRCPV}"
SRCREV = "434924e6125066ea1d90d3871b6bfc805b83aeb7"

S = "${WORKDIR}/git"

DEPENDS = "libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

