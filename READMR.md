Para criar um novo projeto em Java

- Opção Ver/Paleta de comandos
- digitar: "java"
- Escolher: "create java object"
- Tipo de projeto: "no build tools" (ou outro)
- Escolher a pasta do projeto
- Nome do projeto

<hr>

main = método principal <br>
public = método público <br>
final = módulo não pode ser modificado <br>
static = só há uma instancia do método na memória <br>
void = método que não retorna valor <br>

    // Método não retorna valor (void)
    public static void saudacao(String var) {
        System.out.println("Olá, " + var);
    }

    // Método retorna valor (int/return)
    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

<hr>

# Tipos primitivos

## Numéricos

- byte (-128 a 127)
- short (-32,768 a 32,767)
- int (-2^31 a 2^31-1)
- long (-2^63 a 2^63-1)
- float (Este tipo de dados nunca deve ser usado para valores precisos, como moeda. Para isso, você precisará usar a classe java.math.BigDecimal. Numbers and Strings cobre BigDecimal e outras classes úteis fornecidas pela plataforma Java.)
- double (Este tipo de dados nunca deve ser usado para valores precisos, como moeda. Para isso, você precisará usar a classe java.math.BigDecimal. Numbers and Strings cobre BigDecimal e outras classes úteis fornecidas pela plataforma Java.)

## Não numéricos

- boolean
- char
- String

## Aceita

- float n1 = 2.3f;
- double n2 = 3.14d;
- float n3 = n1 + (float) n2;
- int n4 = 23_357_935 (= a 23357935)
- int n5 = 23_35_79_35 (= a 23357935)
