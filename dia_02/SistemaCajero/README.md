## ✏️ EJERCICIO 2: Sistema de Cajero Automático

**Objetivo:** Crear un cajero que use loops para procesar operaciones

**Requerimientos:**

1. **Variables iniciales:**
   - Saldo inicial: $500,000
   - PIN correcto: 1234
   - Máximo 3 intentos de PIN

2. **Funcionalidades:**
   - Validar PIN (do-while, máximo 3 intentos)
   - Mostrar menú (do-while hasta que elija salir)
   - Opciones:
     - 1. Consultar saldo
     - 2. Retirar (validar monto <= saldo)
     - 3. Depositar
     - 4. Ver últimas 5 transacciones (usar for)
     - 5. Salir

3. **Reglas:**
   - Si falla PIN 3 veces, bloquear y terminar
   - No permitir retiros > saldo
   - Mostrar saldo después de cada operación
   - Contar número de transacciones realizadas

4. **Extra (si quieres ir más allá):**
   - Simular 5 transacciones previas y mostrarlas con un for loop
