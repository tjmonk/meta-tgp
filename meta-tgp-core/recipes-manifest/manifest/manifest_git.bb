LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c02c14313846fbed7776c5e0ea3c51c7"

SRC_URI = "git://github.com/tjmonk/manifest.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.5+git${SRCPV}"
SRCREV = "c1dd6e38fe3da76263be1df2180de553a95e5f30"

S = "${WORKDIR}/git"

DEPENDS = "varserver libtjson openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

