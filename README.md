# TallerPOO4 

Este proyecto implementa un sistema académico completo diseñado para digitalizar, automatizar y optimizar la gestión de certificaciones profesionales en un entorno universitario.  
## Objetivos del sistema
El software proporciona:

### Transparencia  
Los estudiantes visualizan en tiempo real:  
- Progreso académico  
- Requisitos pendientes  
- Proyección de completación  

### Eficiencia  
Los coordinadores acceden a dashboards analíticos para:  
- Identificar asignaturas críticas  
- Detectar patrones de rendimiento  
- Monitorear cohortes de estudiantes  

### Automatización  
Generación automática de certificados oficiales una vez cumplidos los requisitos.

---

##  Integrantes
| Nombre | RUT | Carrera |
|--------|-----------|---------|
| **Juan Guzmán** | 21.679.842-2 | ITI |
| **Camila Morales** | 21.539.145-9 | ICCI |

---

##  Estructura del Proyecto

### GUI (`/gui`)
- `Gui.java`  
- `GuiEstudiante.java`  
- `GuiCoorAdmin.java`  
- `GuiCoordinador.java`  
- `GuiAdmin.java`  
- `GuiEstAdmin.java`  

### Lógica (`/logica`)
- `App.java`  
- `Controlador.java`  
- `Factory.java`  
- `IStrategyPromedio.java`  
- `MenuAdmin.java`  
- `MenuEstudiante.java`  
- `PromedioGeneral.java`  
- `MenuCoor.java`  

### Dominio (`/dominio`)
- `Admin.java`  
- `AsignaturaCertificacion.java`  
- `Certificacion.java`  
- `Coordinador.java`  
- `Cursos.java`  
- `Estudiantes.java`  
- `Notas.java`  
- `Registros.java`  
- `Usuario.java`  
---
## Patrones de Diseño Utilizados

| Patrón |
|--------|
| **Singleton** | 
| **Factory** |
| **Strategy** |
| **Visitor** |
---
##  Instrucciones de Ejecución

1. Ejecutar la clase principal:app.java
2. Ingresar usuario y contraseña según `usuarios.txt`.
3. Presionar **Ingresar**.
4. El sistema abrirá la interfaz correspondiente según el rol:  
- **Administrador**  
- **Coordinador**  
- **Estudiante**  
   
