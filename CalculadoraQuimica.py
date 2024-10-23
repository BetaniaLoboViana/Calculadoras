def numero_massa(protons, neutrons):
    return protons + neutrons

def numero_mols(massa, massa_molar):
    return massa / massa_molar

def densidade(massa, volume):
    return massa / volume

def concentracao_molar(mols, volume):
    return mols / volume

def concentracao_comum(massa_soluto, volume_solucao):
    return massa_soluto / volume_solucao

def diluicao(c1, v1, v2):
    return c1 * v1 / v2

def ph_concentration(concentration):
    import math
    return -math.log10(concentration)

def ddp(resistencia, corrente):
    return resistencia * corrente

def clapeyron(p, v, n, r, t):
    return (p * v) / (n * r * t)

def isomeros_opticamente_ativos(centros_assimetria):
    return 2 ** centros_assimetria


print("Escolha o cálculo:")
print("1. Número de Massa")
print("2. Número de Mols")
print("3. Densidade")
print("4. Concentração Molar")
print("5. Concentração Comum")
print("6. Diluição")
print("7. pH")
print("8. Diferença de Potencial (DDP)")
print("9. Equação de Clapeyron")
print("10. Isômeros Opticamente Ativos")

escolha = int(input("Digite o número do cálculo que deseja realizar: "))

if escolha == 1:
    protons = float(input("Digite o número de prótons: "))
    neutrons = float(input("Digite o número de nêutrons: "))
    resultado = numero_massa(protons, neutrons)

elif escolha == 2:
    massa = float(input("Digite a massa (g): "))
    massa_molar = float(input("Digite a massa molar (g/mol): "))
    resultado = numero_mols(massa, massa_molar)

elif escolha == 3:
    massa = float(input("Digite a massa (g): "))
    volume = float(input("Digite o volume (m³): "))
    resultado = densidade(massa, volume)

elif escolha == 4:
    mols = float(input("Digite o número de mols: "))
    volume = float(input("Digite o volume (L): "))
    resultado = concentracao_molar(mols, volume)

elif escolha == 5:
    massa_soluto = float(input("Digite a massa do soluto (g): "))
    volume_solucao = float(input("Digite o volume da solução (L): "))
    resultado = concentracao_comum(massa_soluto, volume_solucao)

elif escolha == 6:
    c1 = float(input("Digite a concentração inicial (C1): "))
    v1 = float(input("Digite o volume inicial (V1): "))
    v2 = float(input("Digite o volume final (V2): "))
    resultado = diluicao(c1, v1, v2)

elif escolha == 7:
    concentration = float(input("Digite a concentração de H+ (mol/L): "))
    resultado = ph_concentration(concentration)

elif escolha == 8:
    resistencia = float(input("Digite a resistência (Ω): "))
    corrente = float(input("Digite a corrente (A): "))
    resultado = ddp(resistencia, corrente)

elif escolha == 9:
    p = float(input("Digite a pressão (Pa): "))
    v = float(input("Digite o volume (m³): "))
    n = float(input("Digite o número de mols: "))
    r = float(input("Digite a constante dos gases (J/(mol*K)): "))
    t = float(input("Digite a temperatura (K): "))
    resultado = clapeyron(p, v, n, r, t)

elif escolha == 10:
    centros_assimetria = int(input("Digite o número de centros de assimetria: "))
    resultado = isomeros_opticamente_ativos(centros_assimetria)

print(f"Resultado: {resultado}")
