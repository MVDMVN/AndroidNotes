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
	1.  Открыть файл командой в терминале sudo nano /etc/hosts
	2.  Ввести локальные имена после первых двух строчек:
		127.0.0.1 me.loc
		127.0.0.1 my.loc
		127.0.0.1 api.loc
		127.0.0.1 citrus.loc
		127.0.0.1 lapti.loc
		127.0.0.1 citrus-service.loc
	1.2.3) Для выхода из редактора nano - нажать Ctrl + X, после этого нажать Y для сохранения изменений и выхода.
3. Установленном NVM - для установки потребуется:
	1. sudo apt-get update
	2. Установите curl - sudo apt install curl
	3. curl -sL https://raw.githubusercontent.com/creationix/nvm/v0.33.11/install.sh -o install_nvm.sh
	4. bash install_nvm.sh
	5. source ~/.profile
	6. nvm install 10.15
	7. nvm use 10.15
4. Установленном NPM - sudo apt install npm
5. Установленном docker:
	1. Если он не установлен, вводим docker - узнаем доступные версии docker и выбираем нужную для нас
	2. Вводим docker-compose, узнаем доступную версию для нас и устанавливаем
6. Установленном composer:
	1. Вводим sudo apt install composer (внутри папок для lapti, me, api, смотрим ниже, как создать проект)
	2. Вводим composer install, видим список PHP-зависимости (Problem 1, Problem 2, ....) В каждой описано, что не хватает определённого пакета в виде "ext-...". Для установки необходимых пакетов, необходимо ввести команду sudo apt-get install php-... (то есть, мы заменяем ext на php и оставляем такое же имя пакета). Например, Problem 1 - "не хватает ext-imagick", мы вводим sudo apt-get install php-imagick.
	1.6.3) Повторяем пункт 1.6.2 до тех пор, пока все ошибки не исчезнут.
	1.6.4) Когда все ошибки исчезли - делаем composer install
7. Насроенном docker network - sudo docker network create citrus_net один раз
