![image](https://github.com/PanchoFJF/ucse-prog2-2024-U2-Fornari/assets/130616220/69d11cbd-b1ec-4b88-bba7-de55e7bcaa6a)

**Conclusiones:** El benchmark "testSequentialStream (7,042 ops/s)" es más rápido que "testParallelStream (6,504 ops/s)"
en esta prueba, es decir, se tiene que usar stream porque realiza una mayor cantidad de operaciones por segundo.

# Correcciones - Estado: APROBADO

## Adicionales:

- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto
  en vez de ir en test/java deberían de ir dentro de test/java/org/example
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package
  correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Se podría analizar qué Modo de Benchmark utilizaron, por qué lo
  eligieron (o incluso comparar los resultados entre los distintos modos), análizar qué representan los resultados, cómo
  influye la tasa de errores, etc. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Para futuros trabajos, les sugiero actualizar directamente el archivo `README.md` con estas conclusiones y las nuevas
  imágenes pertinentes, en lugar de incluirlas únicamente en la sección de "Correcciones realizadas".

  En relación a los resultados, la conclusión presentada es correcta; sin embargo, me gustaría destacar un
  aspecto crucial. Es importante que comprendan que, a pesar de las variaciones posibles debido al hardware utilizado,
  (como podemos observar en su caso particular) la diferencia principal radica en cómo se utilizan los núcleos de la CPU
  en los diferentes enfoques.

  En un enfoque secuencial, se emplea un único núcleo de la CPU, por lo que el tiempo de ejecución se basa únicamente en
  el rendimiento de ese núcleo para completar todas las operaciones. En contraste, el **Stream Paralelo** debería
  resultar considerablemente más rápido que el **Stream Secuencial** en términos de tiempo de ejecución (en éste caso
  medido en milisegundos por operación, ops/s).

  Suponiendo que contamos con 2 núcleos, el rendimiento paralelo idealmente debería acercarse a la mitad del tiempo
  requerido por el método secuencial, siempre y cuando el procesamiento se distribuya de manera óptima y no existan
  otros cuellos de botella. No obstante, en la práctica, esta mejora ideal rara vez se alcanza.

  Además, es posible observar que el margen de error en el **Método Paralelo** puede ser menor si el paralelismo se
  gestiona de manera eficiente y los hilos se distribuyen adecuadamente entre los núcleos. Sin embargo, si la gestión
  del paralelismo es inadecuada, debido a la sincronización y la administración de hilos, el margen de error podría ser
  incluso mayor que en el **Método Secuencial**.

  Otro aspecto importante a considerar, es que en el enfoque paralelo el orden de ejecución no está bajo nuestro control
  y puede darnos resultados impredecibles y desordenados y, como cualquier otra programación paralela, son complejos y
  propensos a errores. Pueden consultar éstos enlaces si desean investigar más: [1], [2].

  Aunque éstas observaciones son complementarias y su trabajo está muy bien, espero que estas observaciones les
  sean útiles para futuros trabajos y la correcta interpretación de los resultados.
- Más allá de haber actualizado el archivo `.gitignore`, el código aún permanece en el repositorio remoto. Quiero
  enfatizar que <span style="color: gold">**IGNORAR UN ARCHIVO YA PUSHEADO NO LO ELIMINA DEL REPOSITORIO**.</span>
  Pueden consultar los siguientes
  artículos para más información: [3], [4], [5]. Tal como mencioné en clase, esto les servirá para entender mejor cómo
  funciona Git.
- En ésta misma línea, les sugiero que sigan buenas prácticas al realizar commits, tales como utilizar verbos en
  imperativo y emplear prefijos para aportar claridad semántica. Les recomiendo leer éste artículo sobre un
  desarrollador español que aborda estos aspectos y otros puntos relevantes. [6]
- Además, he notado que los archivos no han sido formateados adecuadamente y no se ha respetado el número máximo de
  caracteres por línea (la línea gris vertical que tienen en Intellij marca justamente ésto). Un ejemplo es en el
  archivo `README.md`, donde las líneas largas dificultan la lectura al exceder los límites visibles de la pantalla. En
  IntelliJ, pueden formatear el código utilizando el atajo de teclado Ctrl + Alt + L [7]. Con otros shortcuts pueden
  optimizar los imports, y muchas cosas más, aunque esto puede variar según el caso si han cambiado la configuración por
  default.

### Bibliografía:

- \[1]: https://www.geeksforgeeks.org/parallel-vs-sequential-stream-in-java/
- \[2]: https://medium.com/@jadhavsid1101/java-parallel-streams-when-to-use-them-and-when-not-to-211d92ac9e38
- \[3]: https://gitready.com/beginner/2009/03/06/ignoring-doesnt-remove-a-file.html
- \[4]: https://medium.com/@rspesc31/forgot-to-add-node-modules-to-gitignore-solved-6c5b7a444c65
- \[5]: https://stackoverflow.com/questions/19663093/apply-gitignore-on-an-existing-repository-already-tracking-large-number-of-file
- \[6]: https://midu.dev/buenas-practicas-escribir-commits-git/
- \[7]: https://www.jetbrains.com/guide/java/tutorials/reading-code/formatting/#:~:text=If%20we%20encounter%20code%20that,L%20(Windows%2FLinux).



