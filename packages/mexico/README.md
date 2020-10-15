# Mexico Customs API

## OperacionEntradaPortBindingApi

All URIs are relative to */OperacionEntradaImpl/OperacionEntradaService*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ceAgregacionMercancia**](OperacionEntradaPortBindingApi.md#ceAgregacionMercancia) | **POST** /ceAgregacionMercancia | ceAgregacionMercancia
[**ceDesagregacionMercancia**](OperacionEntradaPortBindingApi.md#ceDesagregacionMercancia) | **POST** /ceDesagregacionMercancia | ceDesagregacionMercancia
[**consolidacionMaster**](OperacionEntradaPortBindingApi.md#consolidacionMaster) | **POST** /consolidacionMaster | consolidacionMaster
[**desconsolidacionMaster**](OperacionEntradaPortBindingApi.md#desconsolidacionMaster) | **POST** /desconsolidacionMaster | desconsolidacionMaster
[**enviaPendientesP0**](OperacionEntradaPortBindingApi.md#enviaPendientesP0) | **POST** /enviaPendientesP0 | enviaPendientesP0
[**generaGuiaHouseP0Resp**](OperacionEntradaPortBindingApi.md#generaGuiaHouseP0Resp) | **POST** /generaGuiaHouseP0Resp | generaGuiaHouseP0Resp
[**generaGuiaP0Resp**](OperacionEntradaPortBindingApi.md#generaGuiaP0Resp) | **POST** /generaGuiaP0Resp | generaGuiaP0Resp
[**generaP0Resp**](OperacionEntradaPortBindingApi.md#generaP0Resp) | **POST** /generaP0Resp | generaP0Resp
[**getBitacora**](OperacionEntradaPortBindingApi.md#getBitacora) | **POST** /getBitacora | getBitacora
[**incidenciaMercancia**](OperacionEntradaPortBindingApi.md#incidenciaMercancia) | **POST** /incidenciaMercancia | incidenciaMercancia
[**ingresoFlujoAlterno**](OperacionEntradaPortBindingApi.md#ingresoFlujoAlterno) | **POST** /ingresoFlujoAlterno | ingresoFlujoAlterno
[**ingresoParcial**](OperacionEntradaPortBindingApi.md#ingresoParcial) | **POST** /ingresoParcial | ingresoParcial
[**ingresoSimple**](OperacionEntradaPortBindingApi.md#ingresoSimple) | **POST** /ingresoSimple | ingresoSimple
[**ingresoSinID**](OperacionEntradaPortBindingApi.md#ingresoSinID) | **POST** /ingresoSinID | ingresoSinID
[**notificacionIngresoMercancia**](OperacionEntradaPortBindingApi.md#notificacionIngresoMercancia) | **POST** /notificacionIngresoMercancia | notificacionIngresoMercancia
[**obtenDetalleIdAsociado**](OperacionEntradaPortBindingApi.md#obtenDetalleIdAsociado) | **POST** /obtenDetalleIdAsociado | obtenDetalleIdAsociado
[**obtenIdAsociados**](OperacionEntradaPortBindingApi.md#obtenIdAsociados) | **POST** /obtenIdAsociados | obtenIdAsociados
[**rechazo**](OperacionEntradaPortBindingApi.md#rechazo) | **POST** /rechazo | rechazo
[**salidaPedimento**](OperacionEntradaPortBindingApi.md#salidaPedimento) | **POST** /salidaPedimento | salidaPedimento
[**salidaTransferencia**](OperacionEntradaPortBindingApi.md#salidaTransferencia) | **POST** /salidaTransferencia | salidaTransferencia
[**subdivisionMercancia**](OperacionEntradaPortBindingApi.md#subdivisionMercancia) | **POST** /subdivisionMercancia | subdivisionMercancia
[**traspaleoContenedor**](OperacionEntradaPortBindingApi.md#traspaleoContenedor) | **POST** /traspaleoContenedor | traspaleoContenedor
[**traspasoMercancia**](OperacionEntradaPortBindingApi.md#traspasoMercancia) | **POST** /traspasoMercancia | traspasoMercancia
[**validacionGeneral**](OperacionEntradaPortBindingApi.md#validacionGeneral) | **POST** /validacionGeneral | validacionGeneral


## **ceAgregacionMercancia**

ceAgregacionMercancia

### Example
```bash
 ceAgregacionMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CeAgregacionMercancia**](CeAgregacionMercancia.md) |  |

### Return type

[**CeAgregacionMercanciaResponse**](CeAgregacionMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **ceDesagregacionMercancia**

ceDesagregacionMercancia

### Example
```bash
 ceDesagregacionMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CeDesagregacionMercancia**](CeDesagregacionMercancia.md) |  |

### Return type

[**CeDesagregacionMercanciaResponse**](CeDesagregacionMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **consolidacionMaster**

consolidacionMaster

### Example
```bash
 consolidacionMaster
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConsolidacionMaster**](ConsolidacionMaster.md) |  |

### Return type

[**ConsolidacionMasterResponse**](ConsolidacionMasterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **desconsolidacionMaster**

desconsolidacionMaster

### Example
```bash
 desconsolidacionMaster
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DesconsolidacionMaster**](DesconsolidacionMaster.md) |  |

### Return type

[**DesconsolidacionMasterResponse**](DesconsolidacionMasterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **enviaPendientesP0**

enviaPendientesP0

### Example
```bash
 enviaPendientesP0
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnviaPendientesP0**](EnviaPendientesP0.md) |  |

### Return type

[**EnviaPendientesP0Response**](EnviaPendientesP0Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **generaGuiaHouseP0Resp**

generaGuiaHouseP0Resp

### Example
```bash
 generaGuiaHouseP0Resp
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeneraGuiaHouseP0Resp**](GeneraGuiaHouseP0Resp.md) |  |

### Return type

[**GeneraGuiaHouseP0RespResponse**](GeneraGuiaHouseP0RespResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **generaGuiaP0Resp**

generaGuiaP0Resp

### Example
```bash
 generaGuiaP0Resp
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeneraGuiaP0Resp**](GeneraGuiaP0Resp.md) |  |

### Return type

[**GeneraGuiaP0RespResponse**](GeneraGuiaP0RespResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **generaP0Resp**

generaP0Resp

### Example
```bash
 generaP0Resp
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeneraP0Resp**](GeneraP0Resp.md) |  |

### Return type

[**GeneraP0RespResponse**](GeneraP0RespResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getBitacora**

getBitacora

### Example
```bash
 getBitacora
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetBitacora**](GetBitacora.md) |  |

### Return type

[**GetBitacoraResponse**](GetBitacoraResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **incidenciaMercancia**

incidenciaMercancia

### Example
```bash
 incidenciaMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IncidenciaMercancia**](IncidenciaMercancia.md) |  |

### Return type

[**IncidenciaMercanciaResponse**](IncidenciaMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **ingresoFlujoAlterno**

ingresoFlujoAlterno

### Example
```bash
 ingresoFlujoAlterno
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IngresoFlujoAlterno**](IngresoFlujoAlterno.md) |  |

### Return type

[**IngresoFlujoAlternoResponse**](IngresoFlujoAlternoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **ingresoParcial**

ingresoParcial

### Example
```bash
 ingresoParcial
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IngresoParcial**](IngresoParcial.md) |  |

### Return type

[**IngresoParcialResponse**](IngresoParcialResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **ingresoSimple**

ingresoSimple

### Example
```bash
 ingresoSimple
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IngresoSimple**](IngresoSimple.md) |  |

### Return type

[**IngresoSimpleResponse**](IngresoSimpleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **ingresoSinID**

ingresoSinID

### Example
```bash
 ingresoSinID
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IngresoSinID**](IngresoSinID.md) |  |

### Return type

[**IngresoSinIDResponse**](IngresoSinIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **notificacionIngresoMercancia**

notificacionIngresoMercancia

### Example
```bash
 notificacionIngresoMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificacionIngresoMercancia**](NotificacionIngresoMercancia.md) |  |

### Return type

[**NotificacionIngresoMercanciaResponse**](NotificacionIngresoMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **obtenDetalleIdAsociado**

obtenDetalleIdAsociado

### Example
```bash
 obtenDetalleIdAsociado
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObtenDetalleIdAsociado**](ObtenDetalleIdAsociado.md) |  |

### Return type

[**ObtenDetalleIdAsociadoResponse**](ObtenDetalleIdAsociadoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **obtenIdAsociados**

obtenIdAsociados

### Example
```bash
 obtenIdAsociados
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObtenIdAsociados**](ObtenIdAsociados.md) |  |

### Return type

[**ObtenIdAsociadosResponse**](ObtenIdAsociadosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **rechazo**

rechazo

### Example
```bash
 rechazo
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Rechazo**](Rechazo.md) |  |

### Return type

[**RechazoResponse**](RechazoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **salidaPedimento**

salidaPedimento

### Example
```bash
 salidaPedimento
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SalidaPedimento**](SalidaPedimento.md) |  |

### Return type

[**SalidaPedimentoResponse**](SalidaPedimentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **salidaTransferencia**

salidaTransferencia

### Example
```bash
 salidaTransferencia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SalidaTransferencia**](SalidaTransferencia.md) |  |

### Return type

[**SalidaTransferenciaResponse**](SalidaTransferenciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **subdivisionMercancia**

subdivisionMercancia

### Example
```bash
 subdivisionMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubdivisionMercancia**](SubdivisionMercancia.md) |  |

### Return type

[**SubdivisionMercanciaResponse**](SubdivisionMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **traspaleoContenedor**

traspaleoContenedor

### Example
```bash
 traspaleoContenedor
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TraspaleoContenedor**](TraspaleoContenedor.md) |  |

### Return type

[**TraspaleoContenedorResponse**](TraspaleoContenedorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **traspasoMercancia**

traspasoMercancia

### Example
```bash
 traspasoMercancia
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TraspasoMercancia**](TraspasoMercancia.md) |  |

### Return type

[**TraspasoMercanciaResponse**](TraspasoMercanciaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **validacionGeneral**

validacionGeneral

### Example
```bash
 validacionGeneral
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidacionGeneral**](ValidacionGeneral.md) |  |

### Return type

[**ValidacionGeneralResponse**](ValidacionGeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

