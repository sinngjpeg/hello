# 🌍📱 Teste de Strings e Configurações do Dispositivo

## 📝 **Descrição do Projeto**
Este projeto foi criado com o objetivo de:

- 🔤 Testar strings para diferentes idiomas.
- ✅ Validar as configurações do dispositivo que está executando a aplicação.
- 🛠️ Exibir informações detalhadas no log, como densidade de tela, orientação, idioma, MCC e MNC.

---

## 🚀 **Funcionalidades**

- 🌐 Suporte para múltiplos idiomas.
- 📋 Log detalhado das configurações do dispositivo:
  - 📏 Densidade da tela.
  - 🔄 Orientação (retrato ou paisagem).
  - 📐 Resolução da tela (altura e largura em pixels).
  - 🌎 Idioma configurado.
  - 📶 Código MCC (*Mobile Country Code*).
  - 📡 Código MNC (*Mobile Network Code*).

---

## 📂 **Estrutura do Projeto**

- `MainActivity.kt`: Contém a lógica principal para capturar e exibir as configurações do dispositivo no log.
- `res/`: Diretório com os recursos do aplicativo, incluindo arquivos de layout e strings para diferentes idiomas.

---

## 🧪 **Como Testar**

1. Altere o idioma do dispositivo nas configurações.
2. Execute o aplicativo e verifique os logs no Logcat para validar as informações exibidas:
- 🌍 Idioma atual.
- 📏 Densidade da tela.
- 📐 Resolução (altura e largura).
- 📶 MCC e MNC.

---

## 🤓**Explicando**

## 🌐 Suporte para múltiplos idiomas
- O aplicativo é capaz de exibir textos e mensagens em diferentes idiomas, dependendo da configuração de idioma do dispositivo.
- Isso é implementado usando o recurso de *localização* no Android, com arquivos `strings.xml` específicos para cada idioma (por exemplo, `values/strings.xml` para o idioma padrão e `values-pt/strings.xml` para português).
- O idioma configurado no dispositivo é detectado automaticamente, e as strings apropriadas são carregadas.

---

## 📋 Log detalhado das configurações do dispositivo
O aplicativo registra informações importantes sobre o dispositivo no Logcat. Aqui estão os detalhes:

### 📏 Densidade da tela
- Refere-se à quantidade de pixels exibidos por polegada (DPI - *Dots Per Inch*).
- Determina a nitidez e a escala dos elementos da interface do usuário.
- Exemplos de densidades comuns:
  - **ldpi**: baixa densidade (~120 dpi).
  - **mdpi**: densidade média (~160 dpi).
  - **hdpi**: alta densidade (~240 dpi).
  - **xhdpi**, **xxhdpi**, **xxxhdpi**: densidades ainda maiores.
- No código, isso é obtido por meio de `metrics.density`.

---

### 🔄 Orientação (retrato ou paisagem)
- Refere-se à orientação física do dispositivo:
  - **Retrato (portrait)**: Quando o dispositivo está na posição vertical.
  - **Paisagem (landscape)**: Quando o dispositivo está na posição horizontal.
- A orientação pode ser detectada usando `config.orientation`, que retorna valores como:
  - `Configuration.ORIENTATION_PORTRAIT` para retrato.
  - `Configuration.ORIENTATION_LANDSCAPE` para paisagem.

---

### 📐 Resolução da tela (altura e largura em pixels)
- Representa o número total de pixels disponíveis na tela do dispositivo em termos de largura e altura.
- Por exemplo, um dispositivo com resolução de 1080x1920 pixels tem 1080 pixels na largura e 1920 pixels na altura.
- No código, isso é obtido por meio de `metrics.widthPixels` e `metrics.heightPixels`.

---

### 🌎 Idioma configurado
- Refere-se ao idioma configurado no dispositivo.
- O aplicativo pode capturar essa informação para ajustar o conteúdo exibido ao usuário.
- A API retorna o idioma atual como um código ISO 639 (por exemplo, "en" para inglês ou "pt" para português).
- No código, isso é obtido por meio de:
  - `config.locales` (para Android N ou superior).
  - `config.locale` (para versões mais antigas).

---

### 📶 Código MCC (*Mobile Country Code*)
- MCC significa *Mobile Country Code* e identifica o país ao qual a rede móvel do dispositivo pertence.
- É um código numérico que faz parte da configuração da rede celular. Por exemplo:
  - **310**: Estados Unidos.
  - **724**: Brasil.
  - **262**: Alemanha.
- No código, isso é acessado por meio de `config.mcc`.

---

### 📡 Código MNC (*Mobile Network Code*)
- MNC significa *Mobile Network Code* e identifica a operadora de rede móvel dentro do país especificado pelo MCC.
- Por exemplo:
  - Para o Brasil (**MCC: 724**):
    - **01**: TIM.
    - **02**: Claro.
    - **03**: Vivo.
    - **04**: Oi.
- No código, isso é acessado por meio de `config.mnc`.

---

Essas informações são úteis para adaptar o comportamento do aplicativo às características específicas do dispositivo e da rede em que ele está sendo executado. Além disso, elas ajudam desenvolvedores a depurar problemas relacionados à interface ou comportamento regional.
