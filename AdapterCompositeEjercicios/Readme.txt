*PATRÓN ADAPTER
Este patrón permite la cooperación entre clases para extender sus funcionalidades a clases de diferentes tipos. 
Permite establecer un puente entre la clase incompatible con el resto de las clases que quieren usar su funcionalidad, adaptando dichas funcionalidades con el sistema.

**Explicación Ejercicio Adapter.
El ejercicio correspondiente a este patrón se encuentra en el paquete AdapterEjercicio del proyecto AdapterCompositeEjercicios.
Se estructura en las siguientes clases:
-Personal: Esta clase es desde la que heredan los diferentes tipos de personal, con los métodos comunes entre ellos(ingresarSueldo(), ingresarNombres()).
-PersonalDocente: Esta clase hereda de Personal y hace un funcionamiento normal.
-PersonalLimpieza: Esta es la clase adaptable, ya que a pesar de ser también parte del personal emplea metodos distintos que el PersonalDocente, por ello no puede heredar directamente de Personal.
-PersonalLimpiezaAdapter: Esta clase es el puente entre Personal y PersonalLimpieza. Con una isntancia de PersonalAseo se pueden adaptar estas dos clases logrando acceder a los métodos de PersonalAseo a través de los metodos comunes de las clases (ingresarSueldo(), ingresarNombres()).
-MainPersonal: En esta clase se hace uso de todas las clases restantes. Si hago una instancia normal a PersonalDocente, se observa que se puede acceder a los métodos comunes. Si quisiera hacer una isntancia a PersonalAseo tendría que hacerlo con PersonalLimpiezaAseo ya que desde ahí puedo acceder a los métodos comunes y estos a su vez pueden acceder a metodos propios d ela clase PersonalAseo.


*PATRÓN COMPOSITE
Se lo usa para tratar a un grupo de objetos de igual forma. Sirve para construir algoritmos u objetos complejos a partir de otros más simples y similares entre sí, gracias a la composición recursiva y a una estructura en forma de árbol.
Permite jerarquías de objetos tan complejas como se quiera. 
Se pueden añadir nuevos componentes fácilmente.

**Explicación Ejercicio Composite
El ejercicio correspondiente a este patrón se encuentra en el paquete CompositeEjercicio del proyecto AdapterCompositeEjercicios.
-Mascota: Esta es la clase desde donde heredan las demás.
-Perro,Gato: Estas clases con los hijos de Mascota, eredan los mismos métodos de la clase padre.
-Comprando: Esta es la clase Composite, con esta se puede agrupar a los hijos de la clase Mascota (Perro, Gato) e implementar sus métodos. Además se pueden agregar más metodos que ayuden a la manipulación de estos objetos.(Aniadir(), Eliminar(), Clear()).
-MainComposite: Esta es la clase desde donde se puede probar el patrón Composite y manipular los objetos usando este patrón.
