# Для Ubuntu

## Установка aws-cli

1. ```sudo snap install aws-cli --classic```
2. Настроить ключи AWS (если они есть, по очереди вставить их в терминал) Для этого ввести команду:
```aws configure --profile citrus```
Если ключей нет, то спросить у DevOps`a.
3. После ввода ключей необходимо ввести регион. Он ВСЕГДА будет ```eu-west-1```, а ```Default output format``` оставляем пустым.

## Настройка проекта **(!выполняем для каждого проекта!)**
Последующие манипуляции с  GIT начинаем с **этого** пункта не нужно каждый раз выполнять **"Установка aws-cli"**

## Перед установкой проектов необходимо удоствовериться в :
1. Установленном Git - sudo apt-get install git
2. Настроенном файле hosts :
	2.1  Открыть файл командой в терминале sudo nano /etc/hosts
	2.2  Ввести локальные имена после первых двух строчек:
		127.0.0.1 me.loc
		127.0.0.1 my.loc
		127.0.0.1 api.loc
		127.0.0.1 citrus.loc
		127.0.0.1 lapti.loc
		127.0.0.1 citrus-service.loc
	2.3 Для выхода из редактора nano - нажать Ctrl + X, после этого нажать Y для сохранения изменений и выхода.
3. Установленном NVM - для установки потребуется:
	3.1 sudo apt-get update
	3.2 Установите curl - sudo apt install curl
	3.3 curl -sL https://raw.githubusercontent.com/creationix/nvm/v0.33.11/install.sh -o install_nvm.sh
	3.3 bash install_nvm.sh
	3.5 source ~/.profile
	3.6 nvm install 10.15
	3.7. nvm use 10.15
