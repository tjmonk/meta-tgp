LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/manifest.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.2+git${SRCPV}"
SRCREV = "a2f6db63f5b7bb7ea67c92feb53e6d66c5640a29"

S = "${WORKDIR}/git"

DEPENDS = "varserver libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

