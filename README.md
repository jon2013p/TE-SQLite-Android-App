# TE-SQLite-Android-App

INTEGRANTES: ISRAEL VÁSQUEZ - KEVIN SEGOVIA - CHANTAL MORALES - NICOLE ZAMBRANO - SEBASTIÁN MORALES

APLICACIÓN DESARROLLADA EN ANDROID STUDIO QUE PERMITE EL INGRESO, BUSQUEDA Y ELIMINACION DE DATOS DESDE ANDROID A UNA BASE DE DATOS SQLITE.

INTERFAZ

LA APLICACION CUENTA CON UNA INTERFAZ SIMPLE DE UNA PANTALLA EN LA CUAL SE CUENTA CON UN LAYOUT SOBRE EL QUE SE CARGARAN 5 BOTONES, LOS CUALES EJECUTARAN UNA FUNCION EN ESPECIFICO. ADEMAS CONTENDREMOS TRES EDIT TEXT EN LOS QUE PODREMOS INGRESAR LA INFORMACION RESPECTIVA. LA INTERFAZ ESTARÁ ESTRUCTURADA DE LA SIGUIENTE MANERA:

![Alt text](/captures/interfaz.png?raw=true "Estructura de interfaz")

CÓDIGO

SE TIENE DOS COMPONENTES PRINCIPALES PARA EL MANEJO DE LA INFORMACIÓN, EL PRIMERO DE ELLOS SERÁ EL ADMINISTRADOR DEL SQLITE, EN EL CUAL VAMOS A DEFINIR TODOS LOS PARAMETROS NECESARIOS PARA LA CREACION DE LA BASE DE DATOS Y EL MAENJO DE LOS INGRESOS SOBRE ESE ARCHIVO. LA ESTRUCTURA DE ESTE ADMIN QUEDARIA DE LA SIGUIENTE MANERA:

![Alt text](/captures/adminsql.png?raw=true "Administrador SQL")

LUEGO, TENDREMOS EL CODIGO DE NUESTRA CLASE PRINCIPAL, AQUI COMENZAREMOS IMPORTANDO TODOS LOS MODULOS NECESARIOS PARA EL ARMADO DE NUESTRA INFORMACION. LUEGO DEBEREMOS DEFINIR TODAS LAS VARIABLES QUE SERAN INCORPORADAS DE LA INTERFAZ AL CODIGO. LUEGO SE CREAN LOS METODOS PARA CADA UNA DE LAS ACCIONES QUE SERAN ASIGNADAS A LOS BOTONES, TALES COMO LA CREACION, MODIFICACION, CONSULTA Y ELIMINACION DE DATOS DE SQLITE. LA ACTIVIDAD PRINCPIPAL QUEDARIA DE LA SIGUIENTE MANERA:

![Alt text](/captures/activity.png?raw=true "Actividad principal")

APLICACION

UNA VEZ CULMINADO EL ARMADO, PROCEDEMOS A LA EJECUCION DE LA APP EN NUESTRO DISPOSITIVO. AQUI PODREMOS VER NUESTRA INTERFAZ LISTA PATA INGRESAR LOS DATOS REQUERIDOS:

![Alt text](/captures/aplicacion.jpeg?raw=true "Interfaz")

AQUI PODREMOS INGRESAR NUEVOS DATOS PARA DARLES DE ALTA Y QUE ESTOS GENEREN EL NUMERO ARCHIVO DE BASE DE DATOS CON SUS RESPECTIVOS ARGUMENTOS

![Alt text](/captures/alta.jpeg?raw=true "Alta")

SI YA TENEMOS DATOS INGRESADOS EN LA BASE, ENTONCE SPODREMOS CONSULTARLOS MEDIANTE EL CODIGO QUE LE PERTENECE A ESE ARTICULO.

![Alt text](/captures/consulta.jpeg?raw=true "Consulta codigo")

IGUALMENTE, PODREMOS REALIZAR LA CONSULTA DE LOS DATOS MEDIANTE LA DESCRIPCION DEL ARTICULO

![Alt text](/captures/consultadesc.jpeg?raw=true "Consulta descripcion")

SI QUEREMOS MODIFICAR ALGUN DATO PODREMOS INTRODUCIR EL CODIGO DEL ARTICULO A MODIFICAR Y LOS NUEVOS DATOS, UNA VEZ CONCLUIDO PODEMOS DARLE CLIC EN MODIFICAR.

![Alt text](/captures/modificacion.jpeg?raw=true "Modificar")

COMO ULTIMO PODREMOS ELIMINAR ALGUN DATO EN PARTICULAR, PARA ESTO NECESITAMOS COLOCAR EL CODIGO DEL PRODUCTO QUE VAMOS A BORRAR Y DARLE CLIC EN EL BOTON:

![Alt text](/captures/borrado.jpeg?raw=true "Borrar")

PODREMOS COMPROBAR QUE NUESTRA APLICACION GENERÓ Y TRABAJÓ SOBRE LA BASE DE DATOS SI ACCEDEMOS AL ALMACENAMIENTO DEL DISPOSITIVO AL APARTADO DE DATABASES:

![Alt text](/captures/bdd.png?raw=true "BDD")
