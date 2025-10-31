LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/fcgi_auth;protocol=https;branch=main"

# Modify these as desired
PV = "v0.3+git${SRCPV}"
# SRCREV = tags/v0.3 
SRCREV = "6b9005516e383c212b7693e7d8c9852d9fcb11a0"

S = "${WORKDIR}/git"

DEPENDS="varserver sessionmgr fcgi"

# NOTE: the following library dependencies are unknown, ignoring: REQUIRED fcgi
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
