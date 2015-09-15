<%--
  Created by IntelliJ IDEA.
  User: Евгения Еличева
  Date: 08.09.15
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html xmlns="http://www.w3c.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:p="http://primefaces.org/ui">
<h:head></h:head>
<h:body>

    <p:panelGrid style="width: 100%">
        <p:button outcome="productDetail" value="Bookmark" icon="ui-icon-star">
            <f:param name="productId" value="10" />
        </p:button>
        </p:panelGrid>
</h:body>
</html>
