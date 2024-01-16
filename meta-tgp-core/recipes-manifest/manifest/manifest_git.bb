LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/manifest.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.3+git${SRCPV}"
SRCREV = "bde40dc54edf8098f42c3ed6b0e4eb3a972e9cfe"

S = "${WORKDIR}/git"

DEPENDS = "varserver libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

