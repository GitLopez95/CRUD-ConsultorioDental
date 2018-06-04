<%-- 
    Document   : registropaciente
    Created on : 3/06/2018, 12:00:57 PM
    Author     : demon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Pacientes</title>
    </head>
    <body>
        <center>
        <h1>Registro de Paciente</h1>
        <form  action="registropaciente" name="frmnuevo" method="POST" enctype="multipart/form-data" id="frm_nuevo">
            
            <table>
                <tr>
                    <td><label for="">Nombre:</label></td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">Apellido Paterno</label></td>
                    <td><input type="text" name="ap" id="ap"></td>
                </tr>
                <tr>
                    <td><label for="">Apellido Materno</label></td>
                    <td><input type="text" name="am" id="am"></td>
                </tr>
                <tr>
                    <td><label for="">Sexo</label></td>
                    <td><select id="sexo" name="sexo">
                            <option value="F">Femenino</option>
                            <option value="M">Masculino</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="">Fecha de Nacimiento(AAAA-MM-DD)</label></td>
                    <td><input type="text" name="nac" id="nac"></td>
                </tr>
                <tr>
                    <td><label for="">Domicilio</label></td>
                    <td><textarea cols="30" rows="6" name="dom" id="dom"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Teléfono</label></td>
                    <td><input type="text" name="tel" id="tel"></td>
                </tr>
                <tr>
                    <td><label for="">Ocupación</label></td>
                    <td>
                        <select name="ocupa" id="ocupa">
                            <option value="Seleccione una opcion">Seleccione una opcion</option>
                            <%for(int i=1; i<=30; i++){%>
                            <option value='<%= i%>'><%= i%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Registrar Paciente" id="btnregistrapaciente"></td>
                </tr>               
            </table>
            
        </form>
                     
        <br>
        <a href="administracion.jsp">Ver productos</a>
       </center>                 
    </body>
</html>
