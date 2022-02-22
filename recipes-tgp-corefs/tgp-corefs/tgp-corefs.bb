SUMMARY = "TGP Core Filesystem"
DESCRIPTION = "tgp-corefs provide the basic minimal files for the TGP sample image"
LICENSE = "CLOSED"
PR = "r1"

DEPENDS_append = " update-rc.d-native"

RDEPENDS_${PN} = "initscripts"

SRC_URI = "file://etc/execvars/execvars.json \
           file://etc/filevars/filevars.json \
           file://etc/gpioctrl/gpioctrl.json \
           file://etc/vars/vars.json \
           file://etc/init.d/createvars \
           file://etc/init.d/execvars \
           file://etc/init.d/filevars \
           file://etc/init.d/gpioctrl \
           file://etc/init.d/load \
           file://etc/init.d/iothub \
           file://etc/default/volatiles/01-tgp-corefs \
           file://templates/sysinfo.txt \
           file://etc/lighttpd/lighttpd.conf \
           file://etc/config/app.cfg \
           file://etc/config/bbg.cfg \
           file://etc/config/hardware.cfg \
           file://etc/config/init.cfg \
           file://etc/config/tgp.cfg \
           file://bin/current_sample.sh \
"

FILES_${PN} = "/"

S = "${WORKDIR}"


do_install () {
#
# Create directories and install device independent scripts
#
        install -d ${D}${sysconfdir}/vars
        install -d ${D}${sysconfdir}/execvars
        install -d ${D}${sysconfdir}/filevars
        install -d ${D}${sysconfdir}/gpioctrl
        install -d ${D}${sysconfdir}/config
        install -d ${D}${sysconfdir}/load
        install -d ${D}${sysconfdir}/init.d
        install -d ${D}${sysconfdir}/lighttpd
        install -d ${D}${sysconfdir}/default/volatiles
        install -d ${D}${datadir}/templates

        install -m 0644    ${WORKDIR}/etc/gpioctrl/gpioctrl.json         ${D}${sysconfdir}/gpioctrl
        install -m 0644    ${WORKDIR}/etc/execvars/execvars.json         ${D}${sysconfdir}/execvars
        install -m 0644    ${WORKDIR}/etc/filevars/filevars.json         ${D}${sysconfdir}/filevars
        install -m 0644    ${WORKDIR}/etc/vars/vars.json                 ${D}${sysconfdir}/vars
        install -m 0644    ${WORKDIR}/etc/config/app.cfg                 ${D}${sysconfdir}/config
        install -m 0644    ${WORKDIR}/etc/config/bbg.cfg                 ${D}${sysconfdir}/config
        install -m 0644    ${WORKDIR}/etc/config/hardware.cfg            ${D}${sysconfdir}/config
        install -m 0644    ${WORKDIR}/etc/config/init.cfg                ${D}${sysconfdir}/config
        install -m 0644    ${WORKDIR}/etc/config/tgp.cfg                 ${D}${sysconfdir}/config
        install -m 0644    ${WORKDIR}/templates/sysinfo.txt              ${D}${datadir}/templates
        install -m 0755    ${WORKDIR}/etc/init.d/createvars              ${D}${sysconfdir}/init.d/createvars
        install -m 0755    ${WORKDIR}/etc/init.d/execvars                ${D}${sysconfdir}/init.d/execvars
        install -m 0755    ${WORKDIR}/etc/init.d/filevars                ${D}${sysconfdir}/init.d/filevars
        install -m 0755    ${WORKDIR}/etc/init.d/gpioctrl                ${D}${sysconfdir}/init.d/gpioctrl
        install -m 0755    ${WORKDIR}/etc/init.d/load                    ${D}${sysconfdir}/init.d/load
        install -m 0755    ${WORKDIR}/etc/init.d/iothub                  ${D}${sysconfdir}/init.d/iothub
        install -m 0644    ${WORKDIR}/etc/lighttpd/lighttpd.conf         ${D}${sysconfdir}/lighttpd/lighttpd.conf
        install -m 0644    ${WORKDIR}/etc/default/volatiles/01-tgp-corefs ${D}${sysconfdir}/default/volatiles/01-tgp-corefs
        install -m 0755    ${WORKDIR}/bin/current_sample.sh              ${D}${bindir}/current_sample.sh

        update-rc.d -r ${D} createvars start 40 2 3 4 5 .
        update-rc.d -r ${D} execvars start 50 2 3 4 5 .
        update-rc.d -r ${D} filevars start 50 2 3 4 5 .
        update-rc.d -r ${D} gpioctrl start 51 2 3 4 5 .
        update-rc.d -r ${D} load start 52 2 3 4 5 .
        update-rc.d -r ${D} iothub start 53 2 3 4 5 .

}

