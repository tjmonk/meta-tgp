# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "MQTT C Client"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "EDL-1.0 | EPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd3b896dadaeec3410d753ffaeadcfac \
                    file://edl-v10;md5=3adfcc70f5aeb7a44f3f9b495aa1fbf3"

SRC_URI = "git://github.com/eclipse/paho.mqtt.c.git;protocol=https;branch=master"

# Modify these as desired
PV = "v1.3.12+git${SRCPV}"
SRCREV = "f7799da95e347bbc930b201b52a1173ebbad45a7"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "openssl"
# NOTE: spec file indicates the license may be "Eclipse Distribution License 1.0 and Eclipse Public License 2.0"
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

