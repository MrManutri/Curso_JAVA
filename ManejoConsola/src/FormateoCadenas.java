public class FormateoCadenas {
    public static void main(String[] args) {
        var nombre = "Matias";
        var edad = 35;
        var salario = 2100.50;

        //String.format  %s=string %d=entero %f=flotante

        var mensaje = String.format("\nNombre: %s \nEdad: %d \nSalario: $%.2f", nombre, edad, salario);
        System.out.print("mensaje = " + mensaje);

        //metodo printf
        System.out.printf("\nNombre:%s \nEdad:%d \nSalario: $%.2f",  nombre, edad, salario);

        var numeroEmpleado = 12;
        //formateo con text block

        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre:%s
                \tN° Empleado:%04d
                \tEdad:%d años
                \tSalario:%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println("mensaje = " + mensaje);

        //formateo textblock y printf

        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre:%s
                \tN° Empleado:%04d
                \tEdad:%d años
                \tSalario:%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
