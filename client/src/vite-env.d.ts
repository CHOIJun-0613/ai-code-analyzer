/// <reference types="vite/client" />

interface ImportMetaEnv {
    readonly VITE_CLIENT_PORT?: string;
    readonly VITE_SERVER_HOST?: string;
    readonly VITE_SERVER_PORT?: string;
}

interface ImportMeta {
    readonly env: ImportMetaEnv;
}

declare module '*.png' {
    const value: string;
    export default value;
}
