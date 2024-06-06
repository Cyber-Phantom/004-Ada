# Equipamentos de Infra

- Redes = comunicação entre equipamentos
- Comunicação: Cabo ou wireless (rádio)
    - Cabos: Coaxial, par trançado ou fibra
- NIC = placa de rede = conexão por cabo
    - Endereço físico (MAC) e lógico (IP)
- HUB = Conexão por cabos (RJ45)
- Switch = Substituiu o HUB = escalável
- Roteador = Encontra a melhor rota na internet
- Modem = Modulador/Demodulador das informações = pode ter os três (switch, roteador e modem) em um equipamento

# Cabeamento estruturado

- Padrões (NORMAS)
    - NBR 14565 (BRASIL)
    - ANSI/TIA 568
    - ANSI/TIA 569
- Cabo de par trançado
    - UTP = sem isolamento
    - STP = com isolamento
- Cabo coaxial
- Fibra ótica (grande velocidade)

# Kack

Armário que comporta os equipamentos

# Padrões de comunicação lógica (Protocolos)

- OSI e TCP/IP

## Camadas

### OSI

- Aplicação
- Apresentação
- Sessão
- Transporte
- Rede
- Enlace
- Física

### TCP/IP

- Aplicação
- Transporte
- Internet
- Acesso a Rede

# Endereço IP (Camada de transporte)

- IPV4 - Endereço pequeno (255.255.255.0)
    - Limite de 32 bits (divididos em 4 octetos)
    - NAT = mesmo IP de saída
- IPV6 - Endereço grande
    - Limite de 128 bits (divididos em 16 pares)
    - Hexadecimal
    - Dificuldade de implementação

# Cálculo de sub-rede

- Sub-rede = Sub-divisão do IP
- 5 classes
    - A - de 000 a 127 (255.0.0.0)
    - B - de 128 a 191 (255.255.0.0)
    - C - de 192 a 223 (255.255.255.0)
    - D - de 224 a 239 (NA)
    - E - de 240 a 255 (NA)
- Os 3 primeiros octetos não mudam
- O último octeto é de host (divisão) - de 0 a 255

# Domínio, DNS e Latência

- Latência - se baixa = rápida
- Cache - acelera a latência

# Comandos de rede

- ipconfig - status e dados da rede
- ipconfig /displaydns - mostra o cache
- ipconfig /flushdns - (não) limpa o cache de rede
- ping 'endereço' - verifica a conexão e latência
- nslookup 'endereço' - rota do endereço
- tracert 'endereço' - rastreio de rota do endereço
- router print - tracer local
- netstat - mapeia portas

# Segurança

# Wireless
- Cisco Packet Tracer
