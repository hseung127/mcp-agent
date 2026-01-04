# MCP Agent (Java)

Spring Boot 기반의 MCP(Model Context Protocol) 서버 구현을 위한 개인 프로젝트입니다.  
로컬에서 실행되는 오픈소스 LLM(Ollama)을 기반으로 해당 기능(tool)을 호출하는 구조로,
개발 업무 효율성 향상을 목표로 테스트 중입니다.

## 기술 스택
- Java 17
- Spring Boot 3.5.9
- Spring AI MCP (milestone)
- Gradle (Groovy DSL)

## 실행 환경
- 로컬 개발 환경 (Windows)
- 저사양 환경에서도 실행 가능한 구조를 목표로 설계

## 향후 계획
- 실제 작업을 수행하는 MCP tool 확장
