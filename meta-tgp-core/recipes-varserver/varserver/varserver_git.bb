LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varserver.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.55+git${SRCPV}"
SRCREV = "a0a8ef7c891b9c1c7dbd97c3712e1217fa89aacf"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

