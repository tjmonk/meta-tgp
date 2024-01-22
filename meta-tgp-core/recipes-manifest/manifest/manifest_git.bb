LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/manifest.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.4+git${SRCPV}"
SRCREV = "f9003db16154de696da53f020694107740a9a05a"

S = "${WORKDIR}/git"

DEPENDS = "varserver libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

