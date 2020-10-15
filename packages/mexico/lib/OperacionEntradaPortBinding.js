'use strict';

var utils = require('../utils/writer.js');
var OperacionEntradaPortBinding = require('../service/OperacionEntradaPortBindingService');

module.exports.ceAgregacionMercancia = function ceAgregacionMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ceAgregacionMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ceDesagregacionMercancia = function ceDesagregacionMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ceDesagregacionMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.consolidacionMaster = function consolidacionMaster (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.consolidacionMaster(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.desconsolidacionMaster = function desconsolidacionMaster (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.desconsolidacionMaster(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.enviaPendientesP0 = function enviaPendientesP0 (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.enviaPendientesP0(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.generaGuiaHouseP0Resp = function generaGuiaHouseP0Resp (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.generaGuiaHouseP0Resp(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.generaGuiaP0Resp = function generaGuiaP0Resp (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.generaGuiaP0Resp(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.generaP0Resp = function generaP0Resp (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.generaP0Resp(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getBitacora = function getBitacora (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.getBitacora(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.incidenciaMercancia = function incidenciaMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.incidenciaMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ingresoFlujoAlterno = function ingresoFlujoAlterno (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ingresoFlujoAlterno(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ingresoParcial = function ingresoParcial (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ingresoParcial(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ingresoSimple = function ingresoSimple (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ingresoSimple(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ingresoSinID = function ingresoSinID (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.ingresoSinID(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.notificacionIngresoMercancia = function notificacionIngresoMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.notificacionIngresoMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.obtenDetalleIdAsociado = function obtenDetalleIdAsociado (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.obtenDetalleIdAsociado(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.obtenIdAsociados = function obtenIdAsociados (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.obtenIdAsociados(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.rechazo = function rechazo (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.rechazo(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.salidaPedimento = function salidaPedimento (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.salidaPedimento(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.salidaTransferencia = function salidaTransferencia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.salidaTransferencia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.subdivisionMercancia = function subdivisionMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.subdivisionMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.traspaleoContenedor = function traspaleoContenedor (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.traspaleoContenedor(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.traspasoMercancia = function traspasoMercancia (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.traspasoMercancia(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.validacionGeneral = function validacionGeneral (req, res, next) {
  var body = req.swagger.params['Body'].value;
  OperacionEntradaPortBinding.validacionGeneral(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
