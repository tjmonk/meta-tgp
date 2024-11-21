LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/libtjwt.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.7+git${SRCPV}"
SRCREV = "5e7895ae2269da0d9978f05b6dcab6ba6c1f071a"

S = "${WORKDIR}/git"

DEPENDS = "libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

