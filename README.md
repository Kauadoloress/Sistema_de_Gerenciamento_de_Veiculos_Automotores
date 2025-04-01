# 🚗 **Sistema de Gerenciamento de Veículos Automotores**

Um projeto Java que demonstra **conceitos avançados de POO** para gerenciar diferentes tipos de veículos em uma concessionária, com:  
✅ **Herança**, **Polimorfismo**, **Interfaces**  
✅ **Métodos e classes `final`**  
✅ **Sobrecarga de métodos e construtores**  
✅ **Getters/Setters** e atributos privados

----------

## 📋 **Funcionalidades**

### **1. Hierarquia de Classes**

-   **Superclasse Abstrata `Veiculo`**
    
    -   Atributos: `placa`, `marca`, `anoFabricacao` (todos privados)
        
    -   Métodos abstratos: `exibirDetalhes()`
        
    -   Método `final`: `registrarManutencao()`
        

### **2. Interfaces**

-   `VeiculoTerrestre`: Exige método `acelerar()`
    
-   `VeiculoImportado`: Exige método `calcularTaxaImportacao()`
    

### **3. Subclasses**

Classe

Features Únicas

**`Carro`**

Número de portas, rádio com sobrecarga

**`Moto`**

Partida elétrica, método `final empinar()`

**`CaminhaoImportado`**

Taxa de importação (20% de R$1000)

----------

## 🛠 **Tecnologias e Conceitos**

-   **Java 11+**
    
-   **Abstração**: Classe `Veiculo` e métodos abstratos
    
-   **Polimorfismo**: Array de `Veiculo` tratando múltiplos tipos
    
-   **Herança Múltipla**: `CaminhaoImportado` implementa 2 interfaces
    
-   **Encapsulamento**: Atributos privados + getters/setters
