# 🚀 Demand Management CLI

![Java](https://img.shields.io/badge/Java-17-blue)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)

Sistema de gestão de demandas desenvolvido em **Java puro**, com foco em arquitetura limpa, regras de negócio e execução em ambiente CLI.

---

## 🧠 Motivação

No ambiente operacional, o controle de demandas muitas vezes é feito em planilhas ou de forma descentralizada, gerando:

- falta de priorização  
- dificuldade de acompanhamento  
- retrabalho  

Este projeto simula uma solução real para esse cenário, aplicando conceitos de desenvolvimento backend em Java.

---

## ⚙️ Funcionalidades

- ✅ Criação de demandas  
- 📋 Listagem ordenada por prioridade  
- ⚠️ Identificação automática de demandas atrasadas  
- 🔎 Filtro por responsável  
- 💾 Persistência em arquivo CSV  
- 🧩 Menu interativo reutilizável  
- 📊 Logger com timestamp  
- 🎨 Interface com cores no terminal  

---

## 🧱 Arquitetura

O projeto segue uma estrutura inspirada em aplicações reais:
- `menu/` → framework reutilizável de CLI
- `menus/` → camada de apresentação
- `util/` → utilitários
- `repository/` → persistência em arquivo
- `model/` → entidades do domínio
- `service/` → regras de negócio
