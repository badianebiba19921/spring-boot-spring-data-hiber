package com.smile.and.pay.ebb.soap;

import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.models.Product;
import com.smile.and.pay.ebb.models.SmileAndPayResponse;
import org.apache.cxf.wsdl.http.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

@WebService //(name = "SmileAndPayService", targetNamespace="http://server.ws.soap.smileandpay.com/")
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
//@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({ ObjectFactory.class })
public interface SmileAndPayService {

    @WebMethod
    @WebResult(name = "AddMarchandResponse")
    /*@Action(input = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addMarchandRequest",
            output = "http://server.ws.soap.smileandpay.com/SmileAndPayService/addMarchandResponse")*/
    public SmileAndPayResponse addMarchand(
            @WebParam(name = "marchand") Marchand marchand
    );

    @WebMethod
    @WebResult(name = "DeleteMarchandResponse")
    public SmileAndPayResponse deleteMarchandById(
            @WebParam(name = "marchandId") int marchandId
    );

    @WebMethod
    @WebResult(name = "AddProductResponse")
    public SmileAndPayResponse addProduct(
            @WebParam(name = "product") Product product
    );

    @WebMethod
    @WebResult(name = "DeleteProductResponse")
    public SmileAndPayResponse deleteProductById(
            @WebParam(name = "productId") int productId
    );

    @WebMethod
    @WebResult(name = "AssociateResponse")
    public SmileAndPayResponse associate(
            @WebParam(name = "marchandId") int marchandId,
            @WebParam(name = "productId") int productId
    );
}
