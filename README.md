# MCP Agent (Java)

Spring Boot 기반의 MCP(Model Context Protocol) 서버 구현을 위한 개인 프로젝트입니다.  
로컬에서 실행되는 오픈소스 LLM(Ollama)을 활용하여,  
LLM의 판단 결과를 실제 실행 로직(tool)으로 연결하는 구조를 목표로 합니다.  
개발 업무 효율성 향상을 위한 agent 구조를 실험중에 있습니다.

## 기술 스택
- Java 17
- Spring Boot 3.5.9
- Spring AI MCP (milestone)
- Gradle (Groovy DSL)

## 실행 환경
- 로컬 개발 환경 (Windows)
- 저사양 환경에서도 실행 가능한 구조를 목표로 설계

## 향후 계획
- 테스트용 MCP tool(echo) 추가
- LLM(Ollama) 기반 tool-call 테스트
- 실제 작업을 수행하는 MCP tool 확장
