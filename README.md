# homeworksolid

Realizado por: Juan Felipe Mejía Efeer - Susana Pérez Perdomo - Angel David Gomez Sanchez


Los cambios implementados fueron los siguientes:

Main: Code refactoring debido a que en el main se deberia hacer uso del constructor.

Main.main: Problema de inversion de dependencia debido a la dependencia entre material y la clase Estudiante.

Main.verMateriasEstudiantes: Problema Open Closed ya que al agregar una nueva carrera a la clase estudiante se debe modificar directamente el metodo.

Estudiante: Problema de Single responsability al implementar un metodo para el guardado del estudiante en la base de datos.

EnvioMaterial.enviarMaterialEstudiante: Problema de open close ya que al agregar una nueva carrera es necesario agregarla en el codigo, 
ademas se localizo un problema de inversion de dependencia ( en email) ya que depende de la implementacion y no de abstracciones.

Se comenta el codigo original y se remplaza por el codigo nuevo, ademas los comentarios denotados anteriormente se encuentran dentro del codigo
