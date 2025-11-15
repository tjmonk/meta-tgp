LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varserver.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.60+git${SRCPV}"
# SRCREV = tags/v0.60
SRCREV = "74c03c82a30af1d26396b56f4194139a34213aef"

S = "${WORKDIR}/git"

inherit cmake

# Suppress compile errors
CFLAGS += " -Wno-error=stringop-overflow"
CFLAGS += " -Wno-error=stringop-truncation"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
