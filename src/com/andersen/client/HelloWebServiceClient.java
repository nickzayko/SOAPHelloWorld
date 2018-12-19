package com.andersen.client;

        import com.andersen.webService.HelloWebService;

        import javax.xml.namespace.QName;
        import javax.xml.ws.Service;
        import java.net.MalformedURLException;
        import java.net.URL;

public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {

//        создаем ссылку на wsdl описание
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");

        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
        // 1-ый аргумент смотрим в атрибуте targetNamespace
        // 2-ой аргумент смотрим в атрибуте name
        QName qName = new QName("http://webService.andersen.com/", "HelloWebserviceImplService");

        // Теперь мы можем дотянуться до тега service в wsdl описании
        Service service = Service.create(url, qName);

        // а далее и до вложенного в него тега port, чтобы
        // получить ссылку на удаленный от нас объект веб-сервиса
        HelloWebService hello = service.getPort(HelloWebService.class);

//        Теперь можно вызывать удаленный метод
        System.out.println(hello.getHelloString("Nick..."));
    }
}
