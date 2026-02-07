import { defineConfig, loadEnv } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig(({ mode }) => {
    const env = loadEnv(mode, process.cwd(), 'VITE_')
    const clientPort = Number(env.VITE_CLIENT_PORT || 5173)
    const serverHost = env.VITE_SERVER_HOST || 'localhost'
    const serverPort = Number(env.VITE_SERVER_PORT || 8000)

    return {
        plugins: [react()],
        server: {
            port: clientPort,
            strictPort: true,
            proxy: {
                '/api': {
                    target: `http://${serverHost}:${serverPort}`,
                    changeOrigin: true,
                }
            }
        }
    }
})
