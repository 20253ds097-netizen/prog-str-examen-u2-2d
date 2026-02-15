# prog-str-examen-u2-2d

Sección B — Práctica (70%)
Entrega: repositorio del grupo (en TU RAMA). No se permite el uso de arreglos en esta unidad, si no subes tu rama el examen no será calificado.

Problema práctico (2D) — Caja rápida (cobro sin inventario)
Construye un programa de consola en Java que simule una caja rápida.

Requerimientos (NO usar arreglos):
1) Solicita precios (double) uno por uno hasta que el usuario ingrese 0 para terminar captura.
2) Validaciones tipo clase:
   - Antes de leer el precio, usa Scanner.hasNextDouble(). Si NO es double, muestra "Entrada inválida" y termina con return.
   - Si el precio es negativo, muestra "Precio inválido" y usa continue.
3) Después de terminar captura, solicita método de pago:
   1) Efectivo
   2) Tarjeta
   - Valida con hasNextInt(); si no es int, termina con return.
   - Si no es 1 o 2, termina con return.

4) Descuentos:
   - Si el subtotal es >= 500 y el pago es Efectivo: 8% descuento
   - Si el subtotal es >= 500 y el pago es Tarjeta: 5% descuento
   - Si el subtotal es < 500: sin descuento

5) Usa métodos static (mínimo):
   - static boolean esPrecioValido(double p)
   - static double calcularSubtotal(double subtotalActual, double precio)
   - static double calcularDescuento(double subtotal, int metodoPago)
   - static double calcularTotal(double subtotal, double descuento)

6) Imprime ticket final:
   Subtotal, Descuento, Total a pagar (2 decimales)


#Proceso obligatorio de entrega:
- Clonar el repositorio del grupo (ejemplo): git clone <URL_DEL_REPO>
- Entrar al repositorio: cd <carpeta_del_repo>
- Crear tu rama con la nomenclatura: nombres-apellidoPaterno-gradoygrupo
- Ejemplo EXACTO: elieldavid-rodriguez-2c
- Crear y cambiarte a tu rama (ejemplo): git checkout -b elieldavid-rodriguez-2c
- Dentro de tu rama, crear el proyecto y copiar/pegar los archivos base proporcionados.
- Realizar commits con mensajes claros.
- Subir tu rama al remoto: git push -u origin <tu_rama>
- NO se acepta trabajo en main. Si haces push a main, automáticamente estás reprobado en U2.
- Si no subes tu rama, el examen no será calificado ni revisado, sin excepciones.

#Criterio de evaluación (70 puntos)
- Se revisará el código directamente (métodos, validaciones, control de flujo, resultados).
- 10 pts — Clonación correcta y trabajo SOLO en tu rama (nomenclatura correcta, commits, push de la rama).
- 40 pts — Implementación de métodos solicitados (firmas correctas, static, retornos correctos).
- 15 pts — Validaciones y control de flujo (if/else, break, continue, return) usados correctamente.
- 5 pts — Salida/formatos solicitados (mensajes y resultados claros).
