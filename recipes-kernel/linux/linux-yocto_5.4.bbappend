FILESEXTRAPATHS_prepend := "${THISDIR}/files:" 

#SRCREV="18a3c5f7abfdf97f88536d35338ebbee119c355c"

#SRCREV = "bbf5c979011a099af5dc76498918ed7df445635b"
#PV = "5.9+git${SRCPV}"

SRC_URI_append = " file://0001-add-gpio-names.patch"
