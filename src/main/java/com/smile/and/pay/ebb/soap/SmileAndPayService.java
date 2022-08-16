package com.smile.and.pay.ebb.soap;

import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.models.Product;
import com.smile.and.pay.ebb.models.SmileAndPayResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/*@WebService(name = "SmileAndPayService", targetNamespace="http://server.ws.soap.smileandpay.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)*/
//@XmlSeeAlso({ ObjectFactory.class })
public interface SmileAndPayService {

    /*@WebMethod
    @WebResult(name = "AddMarchandResponse")
    @Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addMarchandRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addMarchandResponse")
    public SmileAndPayResponse addMarchand(
            @WebParam(name = "marchand") Marchand marchand
    );

    @WebMethod
    @WebResult(name = "DeleteMarchandResponse")
    @Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/deleteMarchandByIdRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/deleteMarchandByIdResponse")
    public SmileAndPayResponse deleteMarchandById(
            @WebParam(name = "marchandId") int marchandId
    );

    @WebMethod
    @WebResult(name = "AddProductResponse")
    @Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addProductRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addProductResponse")
    public SmileAndPayResponse addProduct(
            @WebParam(name = "product") Product product
    );

    @WebMethod
    @WebResult(name = "DeleteProductResponse")
    @Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/deleteProductByIdRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/deleteProductByIdResponse")
    public SmileAndPayResponse deleteProductById(
            @WebParam(name = "productId") int productId
    );

    @WebMethod
    @WebResult(name = "AssociateResponse")
    @Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/associateRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/associateResponse")
    public SmileAndPayResponse associate(
            @WebParam(name = "marchandId") int marchandId,
            @WebParam(name = "productId") int productId
    );*/
}
