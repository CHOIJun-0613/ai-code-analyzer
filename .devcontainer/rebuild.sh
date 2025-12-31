#!/bin/bash
# Dev Container 재빌드 스크립트

set -e

echo "🔧 Cleaning up old containers and images..."

# 기존 컨테이너 중지 및 제거
docker-compose -f .devcontainer/docker-compose.yml down --remove-orphans 2>/dev/null || true

# 이미지 제거 (선택적)
docker rmi refiner-devcontainer:latest 2>/dev/null || true

echo "🏗️  Building dev container..."

# 캐시 없이 재빌드
docker-compose -f .devcontainer/docker-compose.yml build --no-cache

echo "✅ Dev container rebuild complete!"
echo "💡 Run 'gitpod environment devcontainer rebuild <env-id>' to apply changes"
