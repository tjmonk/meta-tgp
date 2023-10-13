LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/fcgi_auth;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "fbb0bf762e3c9a31f3ca97f0c677fecd7b9961e2"

S = "${WORKDIR}/git"

DEPENDS="varserver sessionmgr fcgi"

# NOTE: the following library dependencies are unknown, ignoring: REQUIRED fcgi
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

