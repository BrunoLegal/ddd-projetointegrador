package br.edu.imepac.entidades;public class PacienteTest {

    private Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    @Test
    public void testSetSexoWhenGenderIsMaleThenSetGenderToM() {
        // Arrange
        char expectedSexo = 'M';

        // Act
        paciente.setSexo(expectedSexo);

        // Assert
        assertEquals(expectedSexo, paciente.getSexo(), "The gender should be set to 'M'");
    }

    @Test
    public void testSetSexoWhenGenderIsFemaleThenSetGenderToF() {
        // Arrange
        char expectedSexo = 'F';

        // Act
        paciente.setSexo(expectedSexo);

        // Assert
        assertEquals(expectedSexo, paciente.getSexo(), "The gender should be set to 'F'");
    }
}