# Recipe created by recipetool

LICENSE="OML"
LIC_FILES_CHKSUM = "file://LICENSE.TERMS;md5=e3aacac3a647af6e7e31f181cda0a06a"

SRC_URI = "git://github.com/FastCGI-Archives/fcgi2;protocol=https;branch=master"

# Modify these as desired
PV = "2.4.2+git${SRCPV}"
SRCREV = "04cd4b370b5fa58bf14c413503f1f1ba65e7152d"

S = "${WORKDIR}/git"

# NOTE: the following prog dependencies are unknown, ignoring: cc_r

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

